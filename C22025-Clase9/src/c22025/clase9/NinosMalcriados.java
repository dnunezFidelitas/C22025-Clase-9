/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase9;

import java.util.Date;

/**
 *
 * @author viti
 */
public class NinosMalcriados {
    private String name;
    private Date birthday;
    private String typeNino;

    public NinosMalcriados() {
    }

    public NinosMalcriados(String name, Date birthday, String typeNino) {
        this.name = name;
        this.birthday = birthday;
        this.typeNino = typeNino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTypeNino() {
        return typeNino;
    }

    public void setTypeNino(String typeNino) {
        this.typeNino = typeNino;
    }

    @Override
    public String toString() {
        return "NinosMalcriados{" + "name=" + name + ", birthday=" + birthday + ", typeNino=" + typeNino + '}';
    }
    
    
    
    
    
}
