# Copyright 2018 TechNexion Ltd.
SUMMARY = "QCACLD driver for QCA9377-based BD-SDMAC module"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://${S}/CORE/HDD/src/wlan_hdd_main.c;beginline=1;endline=20;md5=ec8d62116b13db773825ebf7cf91be1d"

inherit module

SRCREV = "ccf1bfb763e315b76a6ad7562ecae26ee9ef41bd"

SRC_URI = "git://github.com/TechNexion/qcacld-2.0.git;protocol=https;branch=${SRCBRANCH} \
"
SRCBRANCH = "tn-CNSS.LEA.NRT_3.0"

S = "${WORKDIR}/git"

EXTRA_OEMAKE_append = " CONFIG_CLD_HL_SDIO_CORE=y CONFIG_PER_VDEV_TX_DESC_POOL=1 SAP_AUTH_OFFLOAD=1 CONFIG_QCA_LL_TX_FLOW_CT=1 \
                       CONFIG_WLAN_FEATURE_FILS=y CONFIG_FEATURE_COEX_PTA_CONFIG_ENABLE=y \
                       CONFIG_QCA_SUPPORT_TXRX_DRIVER_TCP_DEL_ACK=y CONFIG_WLAN_WAPI_MODE_11AC_DISABLE=y \
                       TARGET_BUILD_VARIANT=user CONFIG_NON_QC_PLATFORM=y CONFIG_HDD_WLAN_WAIT_TIME=10000 CONFIG_P2P_INTERFACE=y"

COMPATIBLE_MACHINE = "mx6|mx7|mx8"
