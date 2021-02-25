package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyClassJournalController {
    @Autowired
    IJournalService JService;
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        JournalEntry entry = new JournalEntry();
        return "start";
    }

    @GetMapping("/journal")
    public List<JournalEntry> fetchAllEntries(){
        var entries = JService.fetchAll();
        return entries;
    }

    @PostMapping("/journalSave")
    public String journalSave(JournalEntry entry){
        JService.save(entry);
        return "start";
    }
//this is the extra
}
