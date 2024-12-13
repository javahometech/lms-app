package com.jm.lms.studentms.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Data
@Entity
@Table(name = "Topics")
public class CreateTopic {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_topic")
	@GenericGenerator(name = "seq_topic", strategy = "increment")
	@Column(name = "id")
	private Long topicId;
	@Column(name = "topic_name")
	private String topicName;
	@Column(name = "topic_author")
	private String topicAuthor;
	@Column(name = "topic_description")
	private String topicDescription;
	@Column(name = "topic_status")
	private String topicStatus;
//	public Long getTopicId() {
//		return topicId;
//	}
//	public void setTopicId(Long topicId) {
//		this.topicId = topicId;
//	}
//	public String getTopicName() {
//		return topicName;
//	}
//	public void setTopicName(String topicName) {
//		this.topicName = topicName;
//	}
//	public String getTopicAuthor() {
//		return topicAuthor;
//	}
//	public void setTopicAuthor(String topicAuthor) {
//		this.topicAuthor = topicAuthor;
//	}
//	public String getTopicDescription() {
//		return topicDescription;
//	}
//	public void setTopicDescription(String topicDescription) {
//		this.topicDescription = topicDescription;
//	}
//	public String getTopicStatus() {
//		return topicStatus;
//	}
//	public void setTopicStatus(String topicStatus) {
//		this.topicStatus = topicStatus;
//	}
//	public CreateTopic(Long topicId, String topicName, String topicAuthor, String topicDescription,
//			String topicStatus) {
//		super();
//		this.topicId = topicId;
//		this.topicName = topicName;
//		this.topicAuthor = topicAuthor;
//		this.topicDescription = topicDescription;
//		this.topicStatus = topicStatus;
//	}
//	public CreateTopic() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "CreateTopic [topicId=" + topicId + ", topicName=" + topicName + ", topicAuthor=" + topicAuthor
//				+ ", topicDescription=" + topicDescription + ", topicStatus=" + topicStatus + "]";
//	}
}
