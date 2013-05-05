<%@page import="org.curso.clases.Division"%>
<%@page import="org.curso.excepciones.ExcepcionDividirPorUno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String resultado = "";
    if(request.getParameter("btnGenerar")!=null){
        String divisor = request.getParameter("txtDivisor");
        String dividendo = request.getParameter("txtDividendo");
        try{
            Division division = new Division(divisor, dividendo);
            resultado = division.dividir();
        } catch (NumberFormatException nfe){
            resultado = "Debe digitar solo números enteros";
        } catch (ArithmeticException ae){
            resultado = "No se puede dividir por cero";
        } catch (ExcepcionDividirPorUno edpu){
            resultado = edpu.getMessage();
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Curso de Excepciones</title>
    </head>
    <body>
        <h1>Curso de Excepciones</h1>
        <form action="index.jsp" method="post">
        <fieldset>
            <legend>Ejemplo de excepciones</legend>
            <table>
                <tr>
                    <td>Divisor</td>
                    <td><input type="text" name="txtDivisor"/></td>
                </tr>
                <tr>
                    <td>Dividendo</td>
                    <td><input type="text" name="txtDividendo"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="btnGenerar" value="Dividir"/></td>
                    <td><input type="text" name="txtResultado" value="<%= resultado %>" size="100"/></td>
                </tr>
            </table>
        </fieldset>
        </form>
    </body>
</html>
