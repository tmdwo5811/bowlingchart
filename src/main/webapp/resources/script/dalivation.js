//회원가입 폼 유효성 검사

//로그인 폼 유효성 검사
function loginFormCheck(){
	var form = document.loginForm;
	if(!form.aId.value || !form.aPw.value){
		alert("아이디 또는 비밀번호를 입력해주세요.")
		form.aId.value.focus();
		location.replace("index");
	}else{
		form.submit();
	}
}
//사이즈 입력 폼 유효성 검사

//비밀번호 찾기 폼 유효성 검사