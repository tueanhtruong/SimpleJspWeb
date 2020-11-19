<%@page import="Bean.ErrorQue"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:wrapper>

</t:wrapper>
<div class= "container">
<h1 class = "col-sm-10">Hello Page</h1>
<table class="table table-striped table-bordered table-hover">
<tr>
<th>To LoginIn</th>
<th>User ID</th>
<th>Password</th>
<th>Pass for gmail service</th>
</tr>
<tr>
<td>Default :</td>
<td>anhtue1</td>
<td>hoian</td>
<td>maithi123!@#</td>
</tr>
<tr>
<th>Icon</th>
<th colspan="3">Function</th>
</tr>
<tr>
<td>
<svg
							class="bi bi-house-fill ml-3" width="2em" height="2em"
							viewbox="0 0 16 16" fill="currentColor"
							xmlns="http://www.w3.org/2000/svg">
							<path fill-rule="evenodd"
								d="M8 3.293l6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6zm5-.793V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"></path>
							<path fill-rule="evenodd"
								d="M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z"></path></svg><span
						class="sr-only">(current)</span>
</td>
<td colspan="3">See Home Page</td>
</tr>
<tr>
<td>
<svg
							class="bi bi-person-square ml-3" width="2em" height="2em"
							viewbox="0 0 16 16" fill="currentColor"
							xmlns="http://www.w3.org/2000/svg">
							<path fill-rule="evenodd"
								d="M14 1H2a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"></path>
							<path fill-rule="evenodd"
								d="M2 15v-1c0-1 1-4 6-4s6 3 6 4v1H2zm6-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"></path></svg>
</td>
<td colspan="3">See Login Page or Information of account page</td>
</tr>
<tr>
<td>
<svg width="2.25em" height="2.25em" viewBox="0 0 16 16"
							class="bi bi-person-lines-fill ml-3" fill="currentColor"
							xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
								d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm7 1.5a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5zm-2-3a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm2 9a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5z" />
</svg>
</td>
<td colspan="3">List of Users in DB and search for Users</td>
</tr>
<tr>
<td>
<svg width="2.25em" height="2.25em" viewBox="0 0 16 16"
							class="bi bi-person-plus-fill ml-3" fill="currentColor"
							xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
								d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm7.5-3a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5z" />
</svg>
</td>
<td colspan="3">Insert to DB page</td>
</tr>
<tr>
<td>
<svg width="2.15em" height="2.15em" viewBox="0 0 16 16" class="bi bi-envelope-fill ml-3" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555zM0 4.697v7.104l5.803-3.558L0 4.697zM6.761 8.83l-6.57 4.027A2 2 0 0 0 2 14h12a2 2 0 0 0 1.808-1.144l-6.57-4.027L8 9.586l-1.239-.757zm3.436-.586L16 11.801V4.697l-5.803 3.546z"/>
</svg>
</td>
<td colspan="3">Gmail Service Page</td>
</tr>
<tr>
<td>
<svg width="2em"
					height="2em" viewBox="0 0 16 16" class="bi bi-pencil-square ml-3"
					fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path
						d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z" />
  <path fill-rule="evenodd"
						d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z" />
</svg>
</td>
<td colspan="3">Update Users Page</td>
</tr>
<tr>
<td>
<svg width="2em"
					height="2em" viewBox="0 0 16 16" class="bi bi-person-x-fill ml-3"
					fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
						d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm6.146-2.854a.5.5 0 0 1 .708 0L14 6.293l1.146-1.147a.5.5 0 0 1 .708.708L14.707 7l1.147 1.146a.5.5 0 0 1-.708.708L14 7.707l-1.146 1.147a.5.5 0 0 1-.708-.708L13.293 7l-1.147-1.146a.5.5 0 0 1 0-.708z" />
</svg>
</td>
<td colspan="3">To delete User</td>
</tr>
<tr>
<td>
<a href="LoginServerlet" ><h5>LOG IN</h5></a>
</td>
<td colspan="3">To Login page</td>
</tr>
<tr>
<td>
<a href="LoginServerlet" ><h5>LOG OUT</h5></a>
</td>
<td colspan="3">To Logout</td>
</tr>

</table>
</div>