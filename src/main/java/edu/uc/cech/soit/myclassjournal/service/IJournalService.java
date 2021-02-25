package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * JournalEnrty Service handles business logic for JournalEnrty DTOs.
 */

public interface IJournalService {

    /**
     * Save a new JournalEnrty Entry
     * @param journalEntry the entry to save.
     */

    void save(JournalEntry journalEntry);

    /**
     * Return all journal entries.
     * @return a collection of all journal entries.
     */

    List<JournalEntry> fetchAll();
}
