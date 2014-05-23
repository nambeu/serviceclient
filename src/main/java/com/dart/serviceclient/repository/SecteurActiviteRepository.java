package com.dart.serviceclient.repository;
import com.dart.serviceclient.domain.SecteurActivite;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = SecteurActivite.class)
public interface SecteurActiviteRepository {
}
