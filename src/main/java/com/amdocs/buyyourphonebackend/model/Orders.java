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
    @Column(name = "orderId")
    private long orderId;

    @Column(name = "deviceImg")
    private String deviceImg;

    @Column(name = "deviceName")
    private String deviceName;

    @Column(name = "deviceVariant")
    private String deviceVariant;

    @Column(name = "devicePrice")
    private long devicePrice;

    @Column(name = "deviceDlvTime")
    private long deviceDlvTime;

    @Column(name = "accessoryImg")
    private String accessoryImg;

    @Column(name = "accessoryName")
    private String accessoryName;

    @Column(name = "accessoryPrice")
    private long accessoryPrice;

    @Column(name = "accessoryDlvTime")
    private long accessoryDlvTime;

    @Column(name = "addressDetail")
    private String addressDetail;

}
