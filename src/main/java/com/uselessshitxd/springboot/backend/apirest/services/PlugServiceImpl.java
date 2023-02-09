package com.uselessshitxd.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uselessshitxd.springboot.backend.apirest.entity.Plug;
import com.uselessshitxd.springboot.backend.apirest.models.dao.IPlugDao;

@Service
public class PlugServiceImpl implements IPlugService {

	@Autowired
	private IPlugDao plugDao;

	@Override
	@Transactional(readOnly = true)
	public List<Plug> findAll() {
		return (List<Plug>) plugDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Plug findById(Long id) {
		// TODO Auto-generated method stub
		return plugDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Plug save(Plug plug) {
		// TODO Auto-generated method stub
		return plugDao.save(plug);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		plugDao.deleteById(id);
	}

}
