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
  <div class="container">

    <%-- 画面タイトル --%>
    <div class="row">
      <h3>
        <c:out value="${displayTitle}" />
        &nbsp;解答の仕方&nbsp;(例題)
      </h3>
    </div>
    <p>

      <%-- メッセージ領域 --%>
    <div class="row">
      <%@include file="/WEB-INF/fragment/messages.jspf"%>
    </div>

      <div class="row">
        次のような問題があります。<br>いくつかの文字が一定の規則で並んでいます。<br> あなたはその規則を見つけ出し、配列を完成させてください。次の例題Wをご覧ください。
      </div>
      <p>
      <div class="row">
        <table class="table table-striped table-bordered">
          <thead class="main-background-color">
            <tr>
              <th class="text-center">例題</th>
              <th class="text-center">法則</th>
              <th class="text-center">回答</th>
            </tr>
          </thead>
          <tr>
            <td class="col-sm-1 text-center">W</td>
            <td class="col-sm-5 text-right position"><c:out value="a　b　a　b　a　b　a　b"></c:out></td>
            <td class="col-sm-6 text-center">
              <div class="btn-group btn-group-sm btn-group-justified" data-toggle="buttons">
                <label class="btn btn-default"> <input type=radio name="w" /> <c:out value="a"></c:out>
                </label> <label class="btn btn-default"> <input type=radio name="w" /> <c:out value="b"></c:out>
                </label> <label class="btn btn-default"> <input type=radio name="w" /> <c:out value="c"></c:out>
                </label> <label class="btn btn-default"> <input type=radio name="w" /> <c:out value="d"></c:out>
                </label> <label class="btn btn-default"> <input type=radio name="w" /> <c:out value="e"></c:out>
                </label> <label class="btn btn-default active"> <input type=radio name="w" checked /> <c:out value="未回答"></c:out>
                </label>
              </div>
            </td>
        </table>
      </div>
      <div class="row">
        この問題では配列が「ab&nbsp;ab&nbsp;ab&nbsp;ab」 という順になっています。<br>したがって次に来る文字は<span class="label label-danger" style="margin: 0px 5px">a</span>となりますので、回答欄の選択肢より<span class="label label-danger" style="margin: 0px 5px">a</span>を選択しててください。
      </div>
      <p>

    <form:form modelAttribute="form" method="get" autocomplete="off" name="form" action="${pageContext.request.contextPath}/challenge/${genreId}" class="form-horizontal">
      <div class="row">
        <div class="panel panel-default main-border-color">
          <div class="panel-body sub-background-color">
            <div class="form-group">
              <label class="col-sm-3 control-label"><span class="label label-danger" style="margin-right: 10px">必須</span>受験者番号</label>
              <div class="col-sm-4">
                <form:input path="userName" class="form-control" />
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-sm-offset-1 col-sm-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
              <td style="vertical-align: middle;">
                <button id="startButton" type="button" class="btn btn-success" onClick="challengeStart()">
                  <i class="glyphicon glyphicon-play-circle"></i>&nbsp;&nbsp;&nbsp;開始
                </button>
              </td>
            </tr>
          </table>
        </div>
      </div>

      <form:hidden path="genreId" />
  </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">
            function challengeStart() {

                // 「OK」時の処理終了

                if ($("#userName").val() == "") {
                    alert("受験者番号を入力してください");
                    return;
                }

                if (window.confirm('開始します。よろしいですか。\n制限時間は10分です。')) {
                    blocUIOn();
                    document.form.submit();
                }
            }

            function blocUIOn() {
                $.blockUI({
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