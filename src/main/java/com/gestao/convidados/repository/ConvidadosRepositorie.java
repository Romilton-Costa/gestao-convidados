package com.gestao.convidados.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestao.convidados.model.Convidado;
public interface ConvidadosRepositorie extends JpaRepository<Convidado,Long >{
    
}
