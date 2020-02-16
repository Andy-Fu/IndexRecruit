$(document).ready(function (){
	$("a.logo").click(function () {
		 console.log(123);
	})
	
	
	
	
	/*
	
    $("#hrfile").change(function () {
    	let fileImage = $("#hrfile");
		let formData = new FormData();
		formData.append("file", fileImage.get(0).files[0]);
		$.ajax({
			type : 'POST',
			url : '/hr/photo',
			dataType : 'text',
			data : formData,
			contentType : false,//ajax上传图片需要添加
			processData : false,
            success:function (respData) {
                console.log(respData);
                //var jsonObj = $.parseJSON(respData);
                //console.log(respData.imgUrl);
              $("#img").attr("src",respData.imgUrl)
              $('#pic').val(respData.imgUrl)
            }
            });
    })
       // $("#itemform").ajaxSubmit(options)
       // out/artifacts/web_war_exploded/temp/3/2/9/b/3/c/9/b/B7F3A6DAE21C482EB1144857331E72F4_.png
   
		 $("#userfile").change(function () {
			alert("aa");
			 let fileImage = $("#userfile");
				let formData = new FormData();
				formData.append("file", fileImage.get(0).files[0]);
				$.ajax({
					type : 'POST',
					url : '/user/photo',
					dataType : 'text',
					data : formData,
					contentType : false,//ajax上传图片需要添加
					processData : false,
		            success:function (respData) {
		                console.log(respData);
		                //var jsonObj = $.parseJSON(respData);
		                //console.log(respData.imgUrl);
		              $("#img").attr("src",respData.imgUrl)
		              $('#pic').val(respData.img)
		            }
		            })
    
    
    })*/
    
   
    

})
