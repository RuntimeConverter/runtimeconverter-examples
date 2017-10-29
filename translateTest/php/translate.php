<?php



require_once 'google-api-php-client/src/Google_Client.php';

require_once 'google-api-php-client/src/contrib/Google_TranslateService.php';


$text = $_REQUEST['text'];
const NL_REPLACE = '*^*';
$text = str_replace("\n", NL_REPLACE, $text);


$client = new Google_Client();

$client->setApplicationName('Google Translate PHP Starter Application');





$client->setClientId('#####removed#####');

$client->setClientSecret('#####removed#####');

$client->setRedirectUri('http://localhost');

$client->setDeveloperKey('#####removed#####');


$service = new Google_TranslateService($client);

$result = Array();

$translations = $service->translations->listTranslations($text, 'ru',Array('source'=>'en'));
$result['ru'] = isset($translations['translations'][0]['translatedText']) ?  $translations['translations'][0]['translatedText']:'';

$translations = $service->translations->listTranslations($text, 'en',Array('source'=>'ru'));

$result['en'] = isset($translations['translations'][0]['translatedText']) ?  $translations['translations'][0]['translatedText']:'';



$result['en'] = nl2br($result['en']);

$result['ru'] = nl2br($result['ru']);
$result['en'] = str_replace(NL_REPLACE,"<br />",$result['en']);
$result['ru'] = str_replace(NL_REPLACE,"<br />",$result['ru']);
$result['en'] = str_replace("* ^ *","<br />",$result['en']);
$result['ru'] = str_replace("* ^ *","<br />",$result['ru']);


if ($result['en'] != $text && !stripos($text,' '))
{
	$transliterated = russianToEnglishTransliterated($text);
	$result['transliterated'] = $transliterated;
	/*
	NOTE: pspell is supported, but may not be installed
	$pspell_link = pspell_new("en");
	if (pspell_check($pspell_link, $transliterated))
	{
		$result['en'] = $transliterated;
		$translations = $service->translations->listTranslations($transliterated, 'ru',Array('source'=>'en'));
		$result['ru'] = isset($translations['translations'][0]['translatedText']) ?  $translations['translations'][0]['translatedText']:'';
	}*/
}

echo json_encode($result);

function russianToEnglishTransliterated($string)
{
	$english = 'q w e r t y u i o p [ ] \\ a s d f g h j k l ; \' z x c v b n m , . /';
	$russian = 'й ц у к е н г ш щ з х ъ \\ ф ы в а п р о л д ж э я ч с м и т ь б ю .';
	$a = explode(' ',$russian);
	$b = explode(' ',$english);
	if (count($a) == count($b))
	{
		return str_replace($a, $b, $string);
	} else {
		throw new Exception();
	}
}

function transliterate()
{
	$english = 'q w e r t y u i o p [ ] \ \ a s d f g h j k l ; \' z x c v b n m , . /';
	$russian = 'й ц у к е н г ш щ з х ъ \\ ф ы в а п р о л д ж э я ч с м и т ь б ю .';
	$russian = 'nd u have to g e n u s u s b \\ f s c a n p o l d e f h i s m and t s u b .';
	$a = explode(' ',$english);
	$b = explode(' ',$russian);
	if (count($a) == count($b))
	{
		return str_replace($a, $b, $string);
	} else {
		throw new Exception();
	}
}
