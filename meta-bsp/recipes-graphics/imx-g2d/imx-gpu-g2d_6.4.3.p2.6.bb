# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "99873d76b8fba0296a5d669301e573b8"
SRC_URI[aarch64.sha256sum] = "5932424b6301401c28f1a74ea43df14199d501fd5b932a656456ae6a5028c7f7"
SRC_URI[arm.md5sum] = "61721ae5e19f8fe1212046a40e42ba85"
SRC_URI[arm.sha256sum] = "d97a5fc040546c4275efe217b358b2476e6d29ada759494879467474b804e321"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"