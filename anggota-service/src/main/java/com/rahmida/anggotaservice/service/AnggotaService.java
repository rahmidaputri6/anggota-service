/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.anggotaservice.service;

import com.rahmida.anggotaservice.entity.Anggota;
import com.rahmida.anggotaservice.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;
    
    public Anggota saveAnggota(Anggota anggota) {
        return anggotaRepository.save(anggota);
    }
    
    public Anggota findAnggotaById(Long anggotaId) {
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
    
}