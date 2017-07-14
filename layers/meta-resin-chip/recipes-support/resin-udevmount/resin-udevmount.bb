SUMMARY = "udev rules for UBIFS"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${RESIN_COREBASE}/COPYING.Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "file://ubifs.rules"

do_install () {
    install -d ${D}/etc/udev/rules.d
    install -m 0666 ${WORKDIR}/ubifs.rules ${D}/etc/udev/rules.d/ubifs.rules
}

FILES_${PN} += " /etc/udev/rules.d/ubifs.rules"

PACKAGES = "${PN}"
