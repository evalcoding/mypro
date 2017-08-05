package com.javaabc.designpatterns;

class Student {

	private int id;
	private String name;
	private String passwd;
	private String sex;
	private String address;

	// ������������С��Χ
	private Student() {
	}

	// ������������С��Χ
	private Student(Student origin) {
		// ����һ��
		this.id = origin.id;
		this.name = origin.name;
		this.passwd = origin.passwd;
		this.sex = origin.sex;
		this.address = origin.address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	/**
	 * Student�Ĵ�����ȫ����Student.Builder��ʹ��һ�ַ������ķ�ʽ������
	 *
	 */
	static class Builder {

		private Student target;

		public Builder() {
			target = new Student();
		}

		public Builder address(int id) {
			target.id = id;
			return this;
		}

		public Builder name(String name) {
			target.name = name;
			return this;
		}

		public Builder password(String passwd) {
			target.passwd = passwd;
			return this;
		}

		public Builder sex(String sex) {
			target.sex = sex;
			return this;
		}

		public Builder address(String address) {
			target.address = address;
			return this;
		}

		public Student build() {
			return new Student(target);
		}

	}

}
public class BuilderDemo {
	public static void main(String[] args) {
		Student student=new Student.Builder().name("cc").build();
	}
}
