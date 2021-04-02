package org.bdshadow.interview;

import lombok.RequiredArgsConstructor;
import org.bdshadow.interview.jpa.Candidate;
import org.bdshadow.interview.jpa.CandidateRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository candidateRepository;

    @Transactional
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    @Transactional(TxType.SUPPORTS)
    public List<Candidate> getByStatus(String statusName) {
        return candidateRepository.findByStatus(null);
    }
}
