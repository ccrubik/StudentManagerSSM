package com.ssm.entity;

import java.io.Serializable;

/**
 * @author Rubik
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 6665007006097121483L;
    private Integer sid;
    private String sname;
    private Integer sage;
    private String sgender;
    private String shobby;
    private String sbirthday;

    public Student() {
        super();
    }

    public Student(Integer sid, String sname, Integer sage, String sgender, String shobby, String sbirthday) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.sgender = sgender;
        this.shobby = shobby;
        this.sbirthday = sbirthday;
    }

    public Student(String sname, Integer sage, String sgender, String shobby, String sbirthday) {
        super();
        this.sname = sname;
        this.sage = sage;
        this.sgender = sgender;
        this.shobby = shobby;
        this.sbirthday = sbirthday;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getShobby() {
        return shobby;
    }

    public void setShobby(String shobby) {
        this.shobby = shobby;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sgender=" + sgender + ", shobby="
                + shobby + ", sbirthday=" + sbirthday + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sage == null) ? 0 : sage.hashCode());
        result = prime * result + ((sbirthday == null) ? 0 : sbirthday.hashCode());
        result = prime * result + ((sgender == null) ? 0 : sgender.hashCode());
        result = prime * result + ((shobby == null) ? 0 : shobby.hashCode());
        result = prime * result + ((sid == null) ? 0 : sid.hashCode());
        result = prime * result + ((sname == null) ? 0 : sname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (sage == null) {
            if (other.sage != null)
                return false;
        } else if (!sage.equals(other.sage))
            return false;
        if (sbirthday == null) {
            if (other.sbirthday != null)
                return false;
        } else if (!sbirthday.equals(other.sbirthday))
            return false;
        if (sgender == null) {
            if (other.sgender != null)
                return false;
        } else if (!sgender.equals(other.sgender))
            return false;
        if (shobby == null) {
            if (other.shobby != null)
                return false;
        } else if (!shobby.equals(other.shobby))
            return false;
        if (sid == null) {
            if (other.sid != null)
                return false;
        } else if (!sid.equals(other.sid))
            return false;
        if (sname == null) {
            if (other.sname != null)
                return false;
        } else if (!sname.equals(other.sname))
            return false;
        return true;
    }
}
