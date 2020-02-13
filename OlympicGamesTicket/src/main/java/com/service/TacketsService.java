package com.service;

import java.util.List;

import com.domain.Tackets;

public interface TacketsService {

	public List<Tackets> findalltackets();
	public Integer sevaadd(Tackets tackets);
	public Tackets updateid(Integer id);
	public Integer saveupdate(Tackets tackets);
	public Integer savedelete(Integer id);
}
