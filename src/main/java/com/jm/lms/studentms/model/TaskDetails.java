package com.jm.lms.studentms.model;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "taskdetails")
public class TaskDetails {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_student")
	    @GenericGenerator(name = "seq_taskdetails", strategy = "increment")

	    @Column(name = "id", nullable = false)
	    @NotNull(message = "ID cannot be null")
	    private Long id;

	    @Column(name = "task_name", nullable = false)
	    @NotNull(message = "Task Name cannot be null")
	    @Size(min = 1, max = 255, message = "Task Name must be between 1 and 255 characters")
	    private String taskName;

	    @Column(name = "created_by", nullable = false)
	    @NotNull(message = "Created By cannot be null")
	    @Size(min = 3, max = 255, message = "Created By must be between 1 and 255 characters")
	    private String createdBy;

	    @Column(name = "task_status", nullable = false)
	    @NotNull(message = "Task Status cannot be null")
	    @Size(min = 1, max = 50, message = "Task Status must be between 1 and 50 characters")
	    private String taskStatus;
}

