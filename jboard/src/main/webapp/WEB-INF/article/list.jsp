<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>글목록</title>
    <link rel="stylesheet" href="/jboard/css/style.css"/>
</head>
<body>
    <div id="wrapper">
        <%@ include file="./_header.jsp" %>
        <main id="article">
            <section class="list">
                <nav>
                    <h1>글목록</h1>
                    <form action="#">
                        <input type="text" name="search" placeholder="제목 키워드, 글쓴이 검색">
                        <input type="submit" value="검색">
                    </form>
                </nav>
                                
                <table border="0">                    
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>글쓴이</th>
                        <th>날짜</th>
                        <th>조회</th>
                    </tr>
                    <c:forEach var="article" items="${requestScope.articles}">
	                    <tr>
	                        <td>${article.no}</td>
	                        <td><a href="/jboard/article/view.do">${article.title}[${article.comment}]</a></td>
	                        <td>${article.nick}</td>
	                        <td>${article.wdate}</td>
	                        <td>${article.hit}</td>
	                    </tr>
                    </c:forEach>
                </table>

                <div class="page">
                    <a href="#" class="prev">이전</a>
                    <a href="#" class="num current">1</a>
                    <a href="#" class="num">2</a>
                    <a href="#" class="num">3</a>
                    <a href="#" class="next">다음</a>
                </div>
                <a href="/jboard/article/write.do" class="btn btnWrite">글쓰기</a>
            </section>
        </main>
        <%@ include file="./_footer.jsp" %>
    </div>    
</body>
</html>