package com.revature.servlets;

import com.revature.pojos.Reimbursement;
import com.revature.services.ReimbursementService;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ReimbursementServlet extends HttpServlet {
    private ReimbursementService service;
    private ObjectMapper mapper;

    @Override
    public void init() throws ServletException {
        System.out.println("Reimbursement servlet initializing...");
        this.service = new ReimbursementService();
        this.mapper = new ObjectMapper();
        System.out.println("Reimbursement servlet initialization successful");
    }

    @Override
    public void destroy() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reimbursementParam = req.getParameter("reimbursement-id");

        if(reimbursementParam == null){
            List<Reimbursement> reimbursementList = service.getListReimbursement();
            String json = mapper.writeValueAsString(reimbursementList);
            resp.getWriter().println(json);
        }else{
            Integer reimbursementId = Integer.parseInt(reimbursementParam);
            Reimbursement reimbursement = service.getReimbursement(reimbursementId);
            String json = mapper.writeValueAsString(reimbursement);
            resp.getWriter().println(json);
        }

        resp.setStatus(200);
        resp.setContentType("Application/Json, Charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader buffer = req.getReader();
        while(buffer.ready()) {
            builder.append(buffer.readLine());
        }
        String json = builder.toString();

        Reimbursement newReimbursement = mapper.readValue(json, Reimbursement.class);
        service.saveReimbursement(newReimbursement);

        resp.setStatus(200);
        resp.setContentType("Application/Json, Charset=UTF-8");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("reimbursement-id");
        Integer reimbursementId = Integer.parseInt(param);
        StringBuilder builder = new StringBuilder();
        BufferedReader buffer = req.getReader();
        while (buffer.ready()){
            builder.append(buffer.readLine());
        }

        String json = builder.toString();
        Reimbursement updateReimbursement = mapper.readValue(json, Reimbursement.class);

        service.updateReimbursement(updateReimbursement, reimbursementId);

        resp.setStatus(200);
        resp.setContentType("Application/Json, Charset=UTF-8");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("reimbursement-id");
        Integer reimbursementId = Integer.parseInt(param);
        service.deleteReimbursement(reimbursementId);

        resp.setStatus(200);
        resp.setContentType("Application/Json, Charset=UTF-8");
    }
}