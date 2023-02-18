<%@ include file="/config/header.jsp" %>

<!DOCTYPE html>
<html class="h-100">

<head>
	<meta charset="UTF-8">
	<meta name="theme-color" content="#712cf9">
	<link rel="stylesheet" href="/css/index.css" />
	<title>Insert title here</title>
</head>

<body class="d-flex h-100 text-center text-bg-dark">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
	  <header class="mb-auto">
	    <div>
	      <h3 class="float-md-start mb-0">WebConfig</h3>
	      <nav class="nav nav-masthead justify-content-center float-md-end">
	        <a class="nav-link fw-bold py-1 px-0 active" aria-current="page" href="#">Index</a>
	        <a class="nav-link fw-bold py-1 px-0" href="<c:url value="#" />">[view-1]</a>
	        <a class="nav-link fw-bold py-1 px-0" href="<c:url value="#" />">[view-2]</a>
	      </nav>
	    </div>
	  </header>
	
	  <main class="px-3">
	    <h1>Esto es el INDEX</h1>
	    <p class="lead">
			Esto es un home hecho con una platilla de Bootstrap v5.2
		</p>
	    <p class="lead">
	      <a href="<c:url value="#" />" class="btn btn-lg btn-secondary fw-bold border-white bg-white">[view-1]</a>
	    </p>
	    <p class="lead">
	      <a href="<c:url value="#" />" class="btn btn-lg btn-secondary fw-bold border-white bg-white">[view-2]</a>
	    </p>
	  </main>
	
	  <footer class="mt-auto text-white-50">
	    <p>Ejercicio de prueba para configuración básica web con anotaciones de Spring y para crear nuestras primeras vistas</p>
	  </footer>
	</div>
	
  </body>
</html>