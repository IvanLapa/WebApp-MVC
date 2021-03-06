package by.itacademy.news_management.service.validation;

import org.apache.log4j.Logger;

import by.itacademy.news_management.entity.News;
import by.itacademy.news_management.service.ParameterSizeField;

public class NewsValidation {
	private static final Logger logger = Logger.getLogger(NewsValidation.class);

	public static final String EMPTY = "";

	/**
	 * Validates if at least one of the Form field data is empty.
	 *
	 * @param news
	 * @return true: validation failed false: validation passed
	 */
	public static boolean isFormEmptyData(News news) {

		if (news == null) {
			logger.error("Error, news == null");
			return true;

		} else if (EMPTY.equals(news.getTitle()) || EMPTY.equals(news.getBrief()) || EMPTY.equals(news.getContent())) {
			return true;
		}
		return false;
	}

	/**
	 * Validates is one of the Form field data is over-length.
	 *
	 * @param news
	 * @return
	 *         <p>
	 *         true: validation failed false: validation passed
	 *
	 */
	public static boolean isFormFieldOverLength(News news) {

		if (news == null) {
			logger.error("Error, news == null");
			return true;

		} else if (news.getTitle().length() > ParameterSizeField.FORM_SECTION_LENGTH
				|| news.getBrief().length() > ParameterSizeField.FORM_BRIEF_LENGTH
				|| news.getContent().length() > ParameterSizeField.FORM_CONTENT_LENGTH) {
			return true;
		}
		return false;
	}

	/**
	 * Validates id range between ID_MIN and ID_MAX
	 *
	 * @param id
	 * @return true: validation passed false: validation failed
	 */
	public static boolean isIdCorrect(int id) {

		if (id >= ParameterSizeField.FORM_ID_MIN && id <= ParameterSizeField.FORM_ID_MAX) {
			return true;
		}
		return false;
	}
}
