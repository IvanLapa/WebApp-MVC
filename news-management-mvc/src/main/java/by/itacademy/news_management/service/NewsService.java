package by.itacademy.news_management.service;

import java.util.List;

import by.itacademy.news_management.entity.News;

public interface NewsService {
	void createNews(News news) throws ServiceException;

	List<News> selectAllNews() throws ServiceException;

	News selectNews(int id) throws ServiceException;

	void deleteNews(int id) throws ServiceException;

	void deleteSelectedNews(int[] id) throws ServiceException;
}
