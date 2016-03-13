package com.jiang.android.rxjavaapp.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig alloperatorsDaoConfig;
    private final DaoConfig operatorsDaoConfig;

    private final alloperatorsDao alloperatorsDao;
    private final operatorsDao operatorsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        alloperatorsDaoConfig = daoConfigMap.get(alloperatorsDao.class).clone();
        alloperatorsDaoConfig.initIdentityScope(type);

        operatorsDaoConfig = daoConfigMap.get(operatorsDao.class).clone();
        operatorsDaoConfig.initIdentityScope(type);

        alloperatorsDao = new alloperatorsDao(alloperatorsDaoConfig, this);
        operatorsDao = new operatorsDao(operatorsDaoConfig, this);

        registerDao(alloperators.class, alloperatorsDao);
        registerDao(operators.class, operatorsDao);
    }
    
    public void clear() {
        alloperatorsDaoConfig.getIdentityScope().clear();
        operatorsDaoConfig.getIdentityScope().clear();
    }

    public alloperatorsDao getAlloperatorsDao() {
        return alloperatorsDao;
    }

    public operatorsDao getOperatorsDao() {
        return operatorsDao;
    }

}
