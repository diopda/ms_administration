package delta.administration.client;

import lombok.Data;

@Data
public class Groupement {
    private Long id;
    private  String nom;
    private  Long nbrePaysan;
    private  String chef;
    private  Long superficieAtt;
    private  Long section;
}
