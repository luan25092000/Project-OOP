package quanlybenhnhan;

public class Delete (int id) {
    Info patient = null; // Tạo 1 flag check 
    for(int i = 0; i < patientList.size(); i++){
        if(patientList.get(i).getId() == id){
            patient = patientList.get(i);
            break;
        }
    }
    //Null thì trả về  không có id, nếu có remove khỏi bộ nhớ
    if(patient.equals(null)){
        System.out.println("patient " + id + " doesn't existed!");
    }
    else{
        patientList.remove(patient);
    }
}
