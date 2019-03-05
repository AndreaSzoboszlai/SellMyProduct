package com.codecool.web.servlet;


import com.codecool.web.model.Person;
import com.codecool.web.service.PersonList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class GreetingServlet extends HttpServlet {
    private String name;
    private String email;
    PersonList pL = new PersonList();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String title = "Test";
        name = req.getParameter("name");
        email = req.getParameter("email");
        pL.addPerson(new Person(name, email));
        req.setAttribute("people", pL.getGreetings());
        PrintWriter writer = resp.getWriter();

        req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.getRequestDispatcher("greeting.jsp").forward(req, resp);
        //req.getRequestDispatcher("greetingjstl.jsp").forward(req, resp);

        boolean jstl = Boolean.valueOf(req.getParameter("jstl"));
        if (jstl) {
            req.getRequestDispatcher("greetingjstl.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("greeting.jsp").forward(req, resp);
        }
    }
}
