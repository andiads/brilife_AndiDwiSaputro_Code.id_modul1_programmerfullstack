<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>
<section>
    <h1>List Pemakai Kontrasepsi</h1>
<ol class="breadcrumb">
    <li><a href="/index"><i class="fa fa-home"></i> Home</a></li>
    <li class="active">List Pemakai Kontrasepsi</li>
</ol>
</section>
<div>
    <div class="box">
        <div class="box-header with-border">
            <h3 class="box-title">Lists</h3>
            <div class="box-tools pull-right">
                <a href="/index/add" type="button" class="btn btn-box-tool"><i class="fa fa-plus"></i></a>
                <br clear="all" />
            </div>
        </div>
        <div class="box-body no-padding">
            <table class="table table-hover table-bordered table-striped">
                <tr>
                    <th>Id_List</th>
                    <th>Id_Propinsi</th>
                    <th>Id_Kontrasepsi</th>
                    <th>Jumlah_Pemakai</th>
                </tr>
                <c:forEach items="${list}" var="row">
                <tr>
                    <td><c:out value="${row.idList}"></c:out></td>
                    <td><c:out value="${row.idPropinsi}"></c:out></td>
                    <td><c:out value="${row.idKontrasepsi}"></c:out></td>
                    <td><c:out value="${row.jumlahPemakai}"></c:out></td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<div>
	<div class="box">
		<a href="/index/report" type="button" class="btn btn-lg btn-block btn-primary">Show Report</a>
	</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>