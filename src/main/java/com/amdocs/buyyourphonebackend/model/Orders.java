package com.amdocs.buyyourphonebackend.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long order_id;

    @Column(name = "device_img")
    private String device_img;

    @Column(name = "device_name")
    private String device_name;

    @Column(name = "device_variant")
    private String device_variant;

    @Column(name = "device_price")
    private long device_price;

    @Column(name = "device_dlv_time")
    private long device_dlv_time;

    @Column(name = "accessory_img")
    private String accessory_img;

    @Column(name = "accessory_name")
    private String accessory_name;

//    @Column(name = "accessory_name")
//    private String accessory_name;

    @Column(name = "accessory_price")
    private long accessory_price;

    @Column(name = "accessory_dlv_time")
    private long accessory_dlv_time;

    @Column(name = "address_detail")
    private String address_detail;

    // foreign key
//    @OneToOne(cascade= CascadeType.ALL)
//    @JoinColumn(name = "family_id")
//    private Family family;

}
