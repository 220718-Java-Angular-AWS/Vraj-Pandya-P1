package com.revature.services;

import com.revature.daos.ReimbursementDAO;
import com.revature.pojos.Reimbursement;

import java.util.List;

public class ReimbursementService {

    private ReimbursementDAO dao;

    public ReimbursementService() {
        this.dao = new ReimbursementDAO();
    }

    public void saveReimbursement(Reimbursement reimbursement) {
        dao.create(reimbursement);
    }

    public Reimbursement getReimbursement(int id) {
        return dao.read(id);
    }
    public List<Reimbursement> getReimbursementForEmployee(int id){
        return dao.readReimbursementByEmployee(id);
    }

    public List<Reimbursement> getListStatus(Boolean status){
        return dao.readStatus(status);
    }

    public List<Reimbursement> getListReimbursement() {
        return dao.readAll();
    }

    public void updateReimbursement(Reimbursement reimbursement, Integer reimbursementId) {
        dao.update(reimbursement, reimbursementId);
    }

    public void deleteReimbursement(int id) {
        dao.delete(id);
    }
}