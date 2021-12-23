package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.ZReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZReportDao extends JpaRepository<ZReport,Integer> {
}
