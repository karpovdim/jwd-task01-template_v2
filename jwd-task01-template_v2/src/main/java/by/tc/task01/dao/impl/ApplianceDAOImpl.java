package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.ApplianceException;
import by.tc.task01.statement.StatementAppliance;

import java.util.*;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        final Map<String, Object> criteriaMap = criteria.getCriteria();
        final List<Appliance> result = new ArrayList<>();
        final List<Appliance> appliances = findAll().stream()
                .filter(appliance -> appliance.getClass().getSimpleName().equals(criteria.getGroupSearchName()))
                .collect(Collectors.toList());
        int count = 0;
        for (Appliance appliance : appliances) {
            for (Map.Entry<String, Object> entry : criteriaMap.entrySet()) {
                String valueString = entry.getKey() + "=" + entry.getValue().toString()+",";
                if (appliance.toString().contains(valueString)){
                     count = count + 1;
                }
            }
            if (count== criteriaMap.size()){
                result.add(appliance);
            }
            count = 0;
        }

        return result;
    }

    @Override
    public List<Appliance> findAll() {
        final StatementAppliance statementAppliance;
        try {
            statementAppliance = new StatementAppliance();
        } catch (ApplianceException e) {
            return Collections.emptyList();
        }
        return statementAppliance.getAppliances();
    }


    // you may add your own code here

}


//you may add your own new classes