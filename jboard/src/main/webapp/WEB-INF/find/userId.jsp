<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>아이디 찾기</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
    <div id="wrapper">
        <header>
            <h3>
                <a href="/index.html" class="title">Board Project</a>
            </h3>
        </header>
        <main id="find">
            <section class="userId">
                <form action="#">
                    <h2 class="tit">아이디 찾기</h2>
                    <table border="0">                        
                        <tr>
                            <td>이름</td>
                            <td><input type="text" name="name" placeholder="이름 입력"/></td>
                        </tr>
                        <tr>
                            <td>이메일</td>
                            <td>
                                <div>
                                    <input type="email" name="email" placeholder="이메일 입력"/>
                                    <button type="button" class="btnAuth">인증번호 받기</button>
                                </div>
                                <div>
                                    <input type="text" name="auth" disabled placeholder="인증번호 입력"/>
                                    <button type="button" class="btnConfirm">확인</button>
                                </div>
                            </td>
                        </tr>                        
                    </table>                                        
                </form>
                
                <p>
                    회원가입시 이메일 주소와 입력한 이메일 주소가 같아야, 인증번호를 받을 수 있습니다.<br>
                    인증번호를 입력 후 확인 버튼을 누르세요.
                </p>

                <div>
                    <a href="../user/login.html" class="btn btnCancel">취소</a>
                    <a href="./resultUserId.html" class="btn btnNext">다음</a>
                </div>
            </section>
        </main>
        <footer>
            <p>
                <span class="copyright">Copyrightⓒ 김철학(개발에반하다.)</span>
                <span class="version">v1.0.1</span>
            </p>
        </footer>
    </div>    
</body>
</html>