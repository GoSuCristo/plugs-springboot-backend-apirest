package com.uselessshitxd.springboot.backend.apirest.services;

import java.util.List;

import com.uselessshitxd.springboot.backend.apirest.entity.Plug;

public interface IPlugService {

	public List<Plug> findAll();
	public Plug findById(Long id);
	public Plug save(Plug plug);
	public void delete(Long id);
}
