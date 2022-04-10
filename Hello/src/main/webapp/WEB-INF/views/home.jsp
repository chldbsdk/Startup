<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.*" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<%
Random ran = new Random();//난수생성을 위한 랜덤 클래스 생성
int nLottoNum =6; //임의의 6개 숫자
int arrLotto[] =new int[nLottoNum]; //6개의 난수를 저장할 버퍼

//초기화하기
//곱셈과 나눗셈의 초기화는 1
//덧셈과 뺼셈의 초기화는 0
//Class는 NULL
for(int i=0;i<=nLottoNum-1;i++) {
	arrLotto[i]=0;
}

int nCurrentCnt=0; //생성된 난수의 현재 개수
int nCurrentVal=0; //생성된 현재 난수의 값
boolean bExistVal = false;

while(true){
	nCurrentVal=ran.nextInt(45) +1; //1~45
	//중복체크
	//중복되지않으면 배열에 푸가
	//중복되면 continue
	//6개가 다 생성되ㅓㅆ는지
	break;
}

%>

</body>
</html>
