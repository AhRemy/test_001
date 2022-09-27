<%@ page contentType="text/html; charset=euc-kr" %>
 <%
System.out.println( "Session ID : " + session.getId() );
 %>

<html>
<head>
<title>Welcome</title>
</head>
<body>
<h1>Session Clustering Test</h1>
<%
    Integer ival = (Integer)session.getAttribute("_session_counter");

    if(ival==null) {
        ival = new Integer(1);
    }
    else {
        ival = new Integer(ival.intValue() + 1);
    }
    session.setAttribute("_session_counter", ival);
    System.out.println("here~~~~");
%>
Session Counter = [<b> <%= ival %> </b>]<p>
<a href="jsp.do">[Reload]</a>
<p>
Current Session ID : <%= request.getRequestedSessionId() %><br />
<center><h3>[ Session Test  ]</h3></center>
<hr>
<%

String id_str=session.getId();
long lasttime=session.getLastAccessedTime();
long createdtime=session.getCreationTime();
long time_used=(lasttime-createdtime)/60000;
int inactive=session.getMaxInactiveInterval()/60;

boolean b_new=session.isNew();
%>

[1] Session ID: [<%=session.getId()%>] <br><hr>
[2] Usage hours(Min): <%=time_used%><br><hr>
[3] Session Idle Time(Min):<%=inactive%><br><hr>
[4] Is it a new session?<br><hr>
<%
if(b_new)
 out.println("Yes. It's a new session.");
else
 out.println("No. It is a same session.");
%>
<hr>

</body>
</html>