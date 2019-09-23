package number3;

import java.io.Serializable;

import javax.persistence.*;
@Embeddable
public class answer  implements  Serializable {
	private static final long serialVersionUID = 1L;
	
@Column (name="ans")
private String answers;


public String getAnswers() {
	return answers;
}

public void setAnswers(String answers) {
	this.answers = answers;
}

}
