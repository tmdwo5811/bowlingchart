//회원가입 폼 유효성 검사
function joinFormCheck() {
	var form = document.joinForm; // form 선택자
	var idPwVali = /^[a-z0-9_]{4,20}$/; // 아이디와 패스워드 유효성 검사
	var emailVali = /^[0-9a-zA-Z]([-_-]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	if (!form.userName.value || !form.userId.value || !form.userPw.value
			|| !form.userEmail.value) {
		alert("아이디 또는 비밀번호를 입력해주세요.")
		form.aId.value.focus();
		return false;
	} else {
		if (!check(idPwVali, form.userId, "아이디는 4~12자의 영문 소문자와 숫자로만 입력이 가능합니다.")) {
			return false;
		} else if (!check(idPwVali, form.userPw,
				"패스워드는 4~12자의 영문 소문자와 숫자로만 입력이 가능합니다.")) {
			return false;
		} else if (form.value == "") {
			alert("이메일을 입력해 주세요");
			email.focus();
			return false;
		} else if (!check(emailVali, form.userEmail, "적합하지 않은 이메일 형식입니다.")) {
			return false;
		} else if (form.userName.value == "") {
			alert("이름을 입력해 주세요");
			form.userName.focus();
			return false;
		} else {
			form.submit();
		}
	}
}

// 로그인 폼 유효성 검사
function loginFormCheck() {
	var form = document.loginForm;
	if (!form.aId.value || !form.aPw.value) {
		alert("아이디 또는 비밀번호를 입력해주세요.")
		form.aId.value.focus();
		return false;
	} else {
		form.submit();
	}
}

// 사이즈 입력 폼 유효성 검사
function sizeSave() {
	var queryString = $("form[name=sizeSaveForm]").serialize();
	$(function() {

		if ($("#memberName").val == null) {
			alert("회원명을 입력하세요");
			$("#memberName").focus();
		} else if ($("#memberPhone").val == null) {
			alert("회원 연락처를 입력하세요");
			$("#memberPhone").focus();
		} else if ($("#teamName").val == null) {
			alert("소속 팀을 선택하여 주세요. 옵션창에 팀이 없다면 팀을 먼저 생성해주세요.");
			$("#teamName").focus();
		} else {
			$.ajax({
				url : "/bowling_prj/sizeSave",
				type : "post",
				dataType : "json",
				data : queryString,
				success : function(data) {
					alert("지공 차트 저장이 완료 되었습니다.");
				}
			})
		}

	})
}
// 비밀번호 찾기 폼 유효성 검사

// 회원가입 폼을 위한 check 함수
function check(re, what, message) {
	if (re.test(what.value)) {
		return true;
	} else {
		alert(message);
		what.value = "";
		what.focus();
	}
}

// ID 중복 체크
function idCheck() {
	$.ajax({
		url : "/bowling_prj/idCheck",
		type : "post",
		dataType : "json",
		data : {
			"userId" : $("#id").val()
		},
		success : function(data) {
			if (data == 1) {
				alert("이미 등록된 아이디 입니다.");
			} else if (data == 0) {
				$("#idChk").attr("value", "Y");
				alert("사용 가능한 아이디 입니다.");
			}
		}
	})
}