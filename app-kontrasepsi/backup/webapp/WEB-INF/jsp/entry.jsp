<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>

<section>
		<h1>Form Entri Pemakai Kontrasepsi</h1>
		<ol class="breadcrumb">
			<li><a href="/list"><i class="fa fa-dashboard"></i> List</a></li>
			<li class="active">Form Entri Pemakai Kontrasepsi</li>
		</ol>
	</section>
	<div>
		<div class="box">
			<div class="box-header with-border">
				<h3 class="box-title">Form</h3>
				<div class="box-tools pull-right">
					<a href="/list" type="button" class="btn btn-box-tool"><i
						class="fa fa-list-ul"></i></a>
				</div>
			</div>
			<form class="form-horizontal" data-toggle="validator" role="form"
				actio="list/save"
				method="post">
				<div class="box-body">
					<input type="hidden" th:field="*{idList}" />

					<div class="form-group">
						<label class="col-sm-1 control-label">Propinsi</label>
						<div class="col-sm-2">
							<select class="form-control" required="true">
								<option value="0">Select Propinsi</option>
								<c:forEach items="${listPropinsi}" var="listProp">
									<option value="${listProp.idPropinsi}">
										${listProp.namaPropinsi}
									</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="form-group"></div>

					<div class="form-group">
						<label class="col-sm-1 control-label">Kontrasepsi</label>
						<div class="col-sm-2">
							<select class="form-control" th:field="*{idKontrasepsi}"
								required="true">
								<option value="0">Select Kontrasepsi</option>
								<c:forEach items="${listKontrasepsi}" var="kontrasepsi">
									<option value="$kontrasepsi.idKontrasepsi">
										${kontrasepsi.namaKontrasepsi}
									</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="form-group"></div>

					<div class="form-group">
						<label class="col-sm-1 control-label" for="itemName">Jumlah
							Pemakai</label>
						<div class="col-sm-1">
							<input type="text" required="true" class="form-control"
								value="${listPemakai.jumlahPemakai}" name="jumlahPemakai" id="jumlahPemakai"
								placeholder="Masukan jumlah pemakai..." />
						</div>
					</div>
				</div>
		</div>
		<div class="box-footer">
			<button class="btn btn-primary" type="submit">Save</button>
		</div>
		</form>
	</div>


<jsp:include page="footer.jsp"></jsp:include>