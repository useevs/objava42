/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.Serializable;

/**
 *
 * @author shahzad
 */
public class TestObject implements Serializable {

    private final static long serialVersionUID = 1232445674456L;

    private Integer id;
    private String name;
    private Double value;
    private Long longValue;

    public TestObject(Integer id, String name, Double value, Long longValue) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.longValue = longValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    @Override
    public String toString() {
        return "TestObject{" + "id=" + id + ", name=" + name + ", value=" + value + ", longValue=" + longValue + '}';
    }
}
