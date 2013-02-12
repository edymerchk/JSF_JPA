<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h1>Registro de Empresa</h1>
		<h:form>
			<h:outputLabel value="Numero de Documento "></h:outputLabel>
			<h:inputText value="#{empresa.numDoc }"></h:inputText>

			<h:outputLabel value="Tipo  de Documento "></h:outputLabel>
			<h:selectOneMenu value="#{empresa.tipoDoc }">
				<f:selectItem itemLabel="NI" itemValue="NI" />
				<f:selectItem itemLabel="CC" itemValue="CC" />
				<f:selectItem itemLabel="TI" itemValue="TI" />
				<f:selectItem itemLabel="PA" itemValue="PA" />
			</h:selectOneMenu>
				
			<h:outputLabel value="Razon Social "></h:outputLabel>
			<h:inputText value="#{empresa.razonSocial }"></h:inputText>
			
				<h:outputLabel value="Tipo  de Empresa "></h:outputLabel>
			<h:selectOneMenu value="#{empresa.tipoEmpresa }">
				<f:selectItem itemLabel="Plubica" itemValue="P" />
				<f:selectItem itemLabel="Privada" itemValue="P" />
				<f:selectItem itemLabel="Mixta" itemValue="M" />
				<f:selectItem itemLabel="Entidad de derecho public" itemValue="D" />
			</h:selectOneMenu>
			
			<h:outputLabel value="Tipo Dcoumento Admin "></h:outputLabel>
			<h:selectOneMenu value="#{empresa.tipoDocAdmin }">
				<f:selectItem itemLabel="CC" itemValue="CC" />
				<f:selectItem itemLabel="TI" itemValue="TI" />
				<f:selectItem itemLabel="PA" itemValue="PA" />
			</h:selectOneMenu>
			
			
			<h:outputLabel value="Numero de Documento Admin "></h:outputLabel>
			<h:inputText value="#{empresa.numDocAdmin }"></h:inputText>
			<br>
			<h:commandButton styleClass="btn btn-primary" value="Grabar" action="#{empresa.newEmpresa }"></h:commandButton>
			<br>
			
			<h:outputLabel styleClass="text-error" value="#{empresa.messagge }"></h:outputLabel>
			

		</h:form>

	</f:view>
</body>
</html>