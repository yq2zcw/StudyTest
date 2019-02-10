$(document).ready(function(){
	$("#Id").click(function(){
		var input_Id = $("#delId").val();
		if(input_Id == null || input_Id == ""){
			alert("输入删除id");
			return false;
		}else{
			var id = /^[0-9]+$/;
			if(!id.test($("#delId").val())){
				alert("只能输数字");
				return false;
			}else{
				alert("已删除");
				$("#deleteId").submit();
			}
		}
	})
})

$(document).ready(function(){
	$("#ADDid").click(function(){
		var input_Id = $("#addid").val();
		var input_Name = $("#addname").val();
		var input_Birthday = $("#addbirthday").val();
		var input_Age = $("#addage").val();
		var input_ClassName = $("#addclassName").val();

		if(input_Id == null || input_Id == ""){
			alert ("输入id");
			return false;
		}else{
			var id = /^[0-9]+$/;
			if(!id.test($("#addid").val())){
				alert("只能输数字");
				return false;
		}else{
				if(input_Name == null || input_Name == ""){
					alert ("输入name");
					return false;
		 }else{
					var name = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
					if(!name.test($("#addname").val())){
						alert("只能输英日文");
						return false;
		 }else{
				if(input_Birthday == null || input_Birthday == ""){
					alert("输入Birthday");
					return false;
						}else{
							var birthday = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
							if(!birthday.test($("#addbirthday").val())){
								alert("只能输date");
								return false;
						}else{
							if (input_Age == null || input_Age == ""){
								alert("输age");
								return false;
							}else{
								var age = /^[0-9]+$/;
								if(!age.test($("#addage").val())){
									alert("只能输数字");
									return false;
							}else{
								if(input_ClassName == null || input_ClassName == ""){
									alert("输ClassName");
									return false;
								}else{
									alert("ok");
									$("#addId").submit();
									}
								}
									}
							}
							}
						}
					}
				}
			}


	})


})

$(document).ready(function(){
	$("#UPDid").click(function(){
		var input_Id = $("#updid").val();
		var input_Name = $("#updname").val();
		var input_Birthday = $("#updbirthday").val();
		var input_Age = $("#updage").val();
		var input_ClassName = $("#updclassName").val();

		if(input_Id == null || input_Id == ""){
			alert ("输入id");
			return false;
		}else{
			var id = /^[0-9]+$/;
			if(!id.test($("#updid").val())){
				alert("只能输数字");
				return false;
		}else{
				if(input_Name == null || input_Name == ""){
					alert ("输入name");
					return false;
		 }else{
					var name = /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
					if(!name.test($("#updname").val())){
						alert("只能输英日文");
						return false;
		 }else{
				if(input_Birthday == null || input_Birthday == ""){
					alert("输入Birthday");
					return false;
						}else{
							var birthday = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
							if(!birthday.test($("#updbirthday").val())){
								alert("只能输date");
								return false;
						}else{
							if (input_Age == null || input_Age == ""){
								alert("输age");
								return false;
							}else{
								var age = /^[0-9]+$/;
								if(!age.test($("#updage").val())){
									alert("只能输数字");
									return false;
							}else{
								if(input_ClassName == null || input_ClassName == ""){
									alert("输ClassName");
									return false;
								}else{
									alert("ok");
									$("#updId").submit();
									}
								}
									}
							}
							}
						}
					}
				}
			}


	})


})