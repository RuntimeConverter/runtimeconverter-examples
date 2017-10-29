<html>
<head>
<title><?php echo htmlspecialchars('Russian <--> English')?></title>
<link rel="shortcut icon" href="1415865048_36643.ico" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/JavaScript">


//setup before functions
var typingTimer;                //timer identifier
var doneTypingInterval = 1000;  //time in ms, 5 second for example
var lastText = '';

$(document).ready(function(){
	//on keyup, start the countdown
	$('#myInput').keyup(function(){
	    clearTimeout(typingTimer);
	    var interval = doneTypingInterval;
		var text = $('#myInput').val();
	    if (text.indexOf(' ') == -1)
	    {
			interval += 0;
	    }
	    typingTimer = setTimeout(doneTyping, interval);
	});
	
	//on keydown, clear the countdown 
	$('#myInput').keydown(function(){
	    clearTimeout(typingTimer);
	});

	$('#myInput').on('change',function(){
	    clearTimeout(typingTimer);
		var text = $('#myInput').val();
		if (text == lastText)
		{
			return true;
		}
	    doneTyping();
	});
});

//user is "finished typing," do something
function doneTyping () {
    var data = {};
    data.text = $('#myInput').val();
    lastText = data.text;
    $.post('translate.php',data,function(json){
		var en = json.en; var ru = json.ru;
		var text = en + '<br /><br />' + ru;
		$('#result').html(text);
	    if (ru && ru.indexOf(' ') == -1)
	    {
	    	$('#dictionary').show();
	    	if (en != data.text)
	    	{
		    	//$('.english').show();
				//$('.english-translation').html(en);
	    	} else {
		    	$('.english').hide();
	    	}
	    	var url = 'http://en.wiktionary.org/wiki/'+encodeURI(ru.trim())+'#Declension';
	    	$('iframe.en').attr('src',url);
	    	var url = 'http://ru.wiktionary.org/wiki/'+encodeURI(ru.trim())+'#.D0.9C.D0.BE.D1.80.D1.84.D0.BE.D0.BB.D0.BE.D0.B3.D0.B8.D1.87.D0.B5.D1.81.D0.BA.D0.B8.D0.B5_.D0.B8_.D1.81.D0.B8.D0.BD.D1.82.D0.B0.D0.BA.D1.81.D0.B8.D1.87.D0.B5.D1.81.D0.BA.D0.B8.D0.B5_.D1.81.D0.B2.D0.BE.D0.B9.D1.81.D1.82.D0.B2.D0.B0';
	    	$('iframe.ru').attr('src',url);
	    	setTimeout(function(){
		    	//var scrollHeight = $("iframe.en").offset().top;
	    		//$('body').animate({scrollTop:scrollHeight},1500);
	    	},50);
    		var interval = setInterval(function(){
        		$('body').scrollTop();
    		},10);
    		setTimeout(function(){
				clearInterval(interval);
    		});
	    } else {
			$('#dictionary').hide();
	    }
    },'json');
}

function refocus()
{
	$('body').animate({scrollTop:0},1500,function(){
		$('#myInput').focus();
	});
	
}

</script>
</head>
<body>
<h3>Translate</h3>
<textarea id="myInput" style="width:75%;height:100px;"></textarea>
<h3>Translation</h3>
<div id="result">n/a</div>

<div id="dictionary" style="display:none;width:100%" onclick="refocus()">
	<h3 style="display:none">Wiki Dictionary</h3>
	<iframe class="en" style="width:75%;height:300px;display:none"></iframe>
	<div class="english" style="display:none">
	<h3 style="display:none">English Translation</h3>
	<p class="english-translation"></p>
	</div>
	<h3>Russian Wiki Dictionary</h3>
	<iframe class="ru" style="width:75%;height:300px;"></iframe>
</div>
</body>
</html>