SUMMARY = "udev rules for UBIFS"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://ubifs.rules"

do_install () {
    install -d ${D}/etc/udev/rules.d
    install -m 0666 ${WORKDIR}/ubifs.rules ${D}/etc/udev/rules.d/ubifs.rules
}

FILES_${PN} += " /etc/udev/rules.d/ubifs.rules"

PACKAGES = "${PN}"
