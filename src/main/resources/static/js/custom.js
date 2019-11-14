//for side bar collapse 
$(document).ready(function () {
	$('#sidebarCollapse').on('click', function () {
		$('#sidebar').toggleClass('active');
		$(this).toggleClass('active');
	});
});

$(document).ready(function(){
	$('#navbarCollapse').on('click',function(){
		$('#navbarSupportedContent').toggleClass('active');
		$(this).toggleClass('active');
	});
});

//for search
$(document).ready(function(){
	$("#search").on("keyup", function() {
		var value = $(this).val().toLowerCase();
		$("#details tr").filter(function() {
			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
		});
	});
});


//for picture upload
$(document).ready(function() {


	var readURL = function(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function (e) {
				$('.avatar').attr('src', e.target.result);
			}

			reader.readAsDataURL(input.files[0]);
		}
	}


	$(".file-upload").on('change', function(){
		readURL(this);
	});
});

//show password
function showPassword() {
	var x = document.getElementById("password");
	if (x.type === "text") {
		x.type = "password";
		$('#eye').addClass("fa-eye");
		$('#eye').removeClass("fa-eye-slash");
	} else {
		x.type = "text";
		$('#eye').addClass("fa-eye-slash");
		$('#eye').removeClass("fa-eye");
	}
}
//for calculation
function calculateTotal() {
	var quantity = document.getElementById("quantity").value;
	var rate = document.getElementById("rate").value;
	var qty= document.getElementById("sQuantity");
	var dp= document.getElementById('dpAmount');
//	var shareAmount = document.getElementById("amount");
	var seboAmount = document.getElementById('seboCommission');
	var cAmount = document.getElementById("commissionAmount");
	var netPayableAmount = document.getElementById('netAmount');

	
	
	//do all the calculations here
	document.getElementById("detail").className = "";
	var total = Number(rate * quantity); 
	var sebo=Number((rate * quantity * 0.015/100).toFixed(2));
	var comm=Number((rate * quantity * 0.0060).toFixed(2));
	if(total){ var dpa=25;
	$("#btnProceed").attr("disabled", false);
	}
	else{
		var dpa=0;
	}
	var net=(total + sebo + comm + dpa).toFixed(2);
	dp.innerHTML=dpa
	qty.innerHTML=quantity;
	netPayableAmount.innerHTML = net;
	seboAmount.innerHTML= sebo
	cAmount.innerHTML= comm;
}

//calculate for selling

function calculateTotal2() {
	var quantity = document.getElementById("quantity").value;
	var rate = document.getElementById("rate").value;
	var prate=document.getElementById("purchaseRate").value;
	
	var qty= document.getElementById("sQuantity");
	var dp= document.getElementById("dpAmount");
	
var shareAmount = document.getElementById("shareAmount");
	var seboAmount = document.getElementById('seboCommission');
	var cAmount = document.getElementById("commissionAmount");
	var cgt = document.getElementById('cgt');
var nra=document.getElementById('netPayableAmount');
var pl=document.getElementById('pl')
	
	
	//do all the calculations here
	document.getElementById("detail1").className = "";

	var total1 = Number(prate * quantity); 
	var sebo1=Number((prate * quantity * 0.015/100).toFixed(2));
	var comm1=Number((prate * quantity * 0.0060).toFixed(2));
	if(total){ var dpa=25;
	$("#btnProceed").attr("disabled", false);
	}
	else{
		var dpa=0;
	}
	var net1=(total + sebo + comm + dpa).toFixed(2);
	
	
	var total2=Number(rate*quantity);
	var sebo2=Number((rate * quantity * 0.015/100).toFixed(2));
	var comm2=Number((rate * quantity * 0.0060).toFixed(2));
	var cgt2=Number(rate*quantity*0.1);
	
	var net2=(total2-sebo2-comm2-cgt2).toFixed(2);
	
	var pl2= (net2-net1);
	
	dp.innerHTML=25
	qty.innerHTML=quantity
	netPayableAmount.innerHTML = net2
	seboAmount.innerHTML= sebo2
	cAmount.innerHTML= comm2
	cgt.innerHTML=cgt2
	nra.innerHTML=net2
	pl.innerHTML=pl2;
}

//for current date
function pickDate(){
	var today = new Date();
	var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
	var cdate = document.getElementById("cdate");
	cdate.innerHTML=date;      	
}
//for uploading pp
function previewFile(){
    var preview = document.querySelector('img'); //selects the query named img
    var file    = document.querySelector('input[type=file]').files[0]; //sames as here
    var reader  = new FileReader();

    reader.onloadend = function () {
        preview.src = reader.result;
    }

    if (file) {
        reader.readAsDataURL(file); //reads the data as a URL
    } else {
        preview.src = "";
    }
}


//to show and hide password
function showPassword() {
	var x = document.getElementById("confirmPassword"), y = document
			.getElementById("password");
	if (x.type === "text") {
		x.type = "password";
		y.type = "password";
		$('#eye').addClass("fa-eye");
		$('#eye').removeClass("fa-eye-slash");
	} else {
		x.type = "text";
		y.type = "text";
		$('#eye').addClass("fa-eye-slash");
		$('#eye').removeClass("fa-eye");
	}
}

//password matching
$('#confirmPassword').on('keyup', function () {
	  if ($('#password').val() == $('#confirmPassword').val()) {
	    $('#message').addClass("fa-check-circle text-success");
	    $('#message').removeClass("fa-times-circle text-danger");
	  } else 
		  $('#message').addClass("fa-times-circle text-danger");
	    $('#message').html('');
	});

 