package com.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Candidate;
import com.service.CandidateService;

@Controller
public class CandidateController {

    @Autowired
    private CandidateService cndServ;

    @PostMapping("/addcandidate")
    public String addCandidate(@RequestParam("candidate") String candidate,
            Principal p, Model model, HttpSession session) {
        String email = p.getName();

        if (cndServ.getCandByUser(email) != null) {

            session.setAttribute("msg", "Already Voted");
        } else {
            String Radha = "";
            String Krishna = "";
            String Kasyap = "";
            String Siddhu = "";

            if (candidate.equals("Radha"))
                Radha = email;
            else if (candidate.equals("Krishna"))
                Krishna = email;
            else if (candidate.equals("Kasyap"))
                Kasyap = email;
            else if (candidate.equals("Siddhu"))
                Siddhu = email;

            Candidate cnd = new Candidate();
            cnd.setRadha(Radha);
            cnd.setKrishna(Krishna);
            cnd.setKasyap(Kasyap);
            cnd.setSiddhu(Siddhu);

            cndServ.addCandidate(cnd);

            session.setAttribute("msg", "Successfully Voted...");
        }

        return "redirect:user/";
    }

}