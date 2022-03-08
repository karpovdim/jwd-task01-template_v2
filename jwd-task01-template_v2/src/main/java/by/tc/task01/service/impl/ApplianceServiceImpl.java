package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final DAOFactory factory = DAOFactory.getInstance();
    private final ApplianceDAO applianceDAO = factory.getApplianceDAO();

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> appliance = applianceDAO.find(criteria);
        return appliance;
    }

    @Override
    public List<Appliance> findAll() {
        return applianceDAO.findAll();
    }
}

