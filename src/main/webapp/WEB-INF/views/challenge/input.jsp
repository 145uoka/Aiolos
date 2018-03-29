<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
</head>

<body>

  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="post" autocomplete="off" name="form" action="${pageContext.request.contextPath}/challenge/answer" class="form-horizontal">

    <div class="container">

      <%-- 画面タイトル --%>
      <div class="row">
        <div class="col-sm-offset-1 col-sm-10">
          <h3>
            <c:out value="${displayTitle}" />
          </h3>
        </div>
      </div>

      <div class="row">
        <table class="table table-striped table-bordered">
          <thead class="main-background-color">
            <tr>
              <th class="text-center">No</th>
              <th class="text-center">法則</th>
              <th class="text-center">回答</th>
            </tr>
          </thead>
          <c:forEach var="list" items="${questionDtoList}" varStatus="status">
            <tr>
              <td class="col-sm-1 text-center">${status.count}</td>
              <td class="col-sm-5 text-right position"><c:out value="${list.description}"></c:out></td>
              <td class="col-sm-6 text-center">
                <div class="btn-group btn-group-sm btn-group-justified" data-toggle="buttons">
                  <c:forEach var="answerList" items="${list.answerDtoList}" varStatus="status">
                    <label class="btn btn-default"> <form:radiobutton path="answer[${list.questionId}]" value="${answerList.branchNo}" /> <c:out value="${answerList.label}"></c:out>
                    </label>
                  </c:forEach>
                  <label class="btn btn-default active"> <form:radiobutton path="answer[${list.questionId}]" value="${answerList.branchNo}" checked="true" /> <c:out value="未回答"></c:out>
                  </label>
                </div>
              </td>
          </c:forEach>
        </table>
      </div>

      <form:hidden path="userName" />
      <form:hidden path="startTime" />
      <form:hidden path="endTime" />
      <form:hidden path="genreId" />

      <div class="row">
        <div class="col-sm-offset-1 col-sm-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
                <button id="answerButton" type="button" class="btn btn-info" onClick="answer()" >
                  <i class="glyphicon glyphicon-floppy-save"></i>&nbsp;&nbsp;&nbsp;回答
                </button>
              </td>
            </tr>
          </table>
        </div>
      </div>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">

  $("#startTime").val((new Date).getTime());

            function answer() {
                if(window.confirm("回答します。よろしいですか?\n一度回答すると取り消しはできません。")) {
                    blocUIOn();
                    $("#endTime").val((new Date).getTime());
                    $("#loading").hide();
                    document.form.submit();
                }

            }

            function blocUIOn() {
                $
                        .blockUI({
                            message : '<p><img src="${pageContext.request.contextPath}/resources/img/gif-load.gif" style="vertical-align:middle;" /> 読み込み中...</p>',
                            css : {
                                border : 'none',
                                padding : '10px',
                                backgroundColor : '#333',
                                opacity : .5,
                                color : '#fff'
                            },
                            overlayCSS : {
                                backgroundColor : '#000',
                                opacity : 0.6
                            }
                        });
            }

            function blocUIOff() {
                $.unblockUI();
            }
        </script>

</body>
</html>