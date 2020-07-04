<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
<title>Report List Pemakai Kontrasepsi</title>
</head>
<body>
	<style type="text/css">
h4 {
	font-family: Arial, sans-serif;
}
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	margin: 0px auto;
}

.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 10px;
	word-break: normal;
}

.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	padding: 10px 10px;
	word-break: normal;
}

.tg .tg-data-jml {
	font-size: 12px;
	text-align: left;
	vertical-align: middle
}

.tg .tg-head {
	font-size: 12px;
	font-weight: bold;
	text-align: center;
	vertical-align: middle
}

.tg .tg-data {
	font-size: 12px;
	text-align: center;
	vertical-align: middle
}

#data-propinsi-nama {
	font-size: 12px;
	text-align: left;
	vertical-align: middle
}
</style>

<div>
	<section>
		<center><h4> BADAN KOORDINASI KELUARGA BERENCANA NASIONAL<br>   
		 REKAPITULASI PEMAKAI ALAT KONTRASEPSI DI INDONESIA</h4></center>
	</section>
</div>
	<table class="tg" style="table-layout: fixed; width: 50%">
		<colgroup>
			<col style="width: 43px">
			<col style="width: 162px">
			<col style="width: 87px">
			<col style="width: 97px">
			<col style="width: 95px">
			<col style="width: 90px">
		</colgroup>
		<thead>
			<tr>
				<th class="tg-head" rowspan="2">No</th>
				<th class="tg-head" rowspan="2">Propinsi</th>
				<th class="tg-head" colspan="3">Pemakai Alat Kontrasepsi</th>
				<th class="tg-head">Jumlah</th>
			</tr>
			<tr>
				<td class="tg-head">Pil</td>
				<td class="tg-head">Kondom</td>
				<td class="tg-head">IUD</td>
				<td class="tg-head"></td>
			</tr>
		</thead>
		<tbody>
		<!-- unfinished, nested JSTL forEach didn't work fine -->
		<c:forEach items="${listPropinsi}" var="rowPropinsi">
			<c:forEach items="${listPemakaiPil}" var="rowPil">
				<c:forEach items="${listPemakaiKondom}" var="rowKondom">
					<c:forEach items="${listPemakaiIUD}" var="rowIUD">
						<tr>
							<td class="tg-data" id="data-propinsi-id"><c:out value="${rowPropinsi.idPropinsi}"></c:out></td>
							<td class="tg-data" id="data-propinsi-nama"><c:out value="${rowPropinsi.namaPropinsi}"></c:out></td>
							<td class="tg-data" id="data-pemakai-pil"><c:out value="${rowPil}"></c:out></td>
							<td class="tg-data" id="data-pemakai-kondom"><c:out value="${rowKondom}"></c:out></td>
							<td class="tg-data" id="data-pemakai-iud"><c:out value="${rowIUD}"></c:out></td>
							<td class="tg-data" id="data-pemakai-total"></td>
						</tr>
					</c:forEach>
				</c:forEach>
			</c:forEach>
		</c:forEach>
			<tr>
				<td class="tg-head" colspan="2">J u m l a h</td>
				<td class="tg-data-jml"></td>
				<td class="tg-data-jml"></td>
				<td class="tg-data-jml"></td>
				<td class="tg-data-jml"></td>
			</tr>
		</tbody>
	</table>
</body>
</html>