SUMMARY = "udev rules for UBIFS"
LICENSE = "ISC"

SRC_URI = "file://ubifs.rules"

do_install () {
    install -d ${D}/etc/udev/rules.d
    install -m 0666 ${WORKDIR}/ubifs.rules ${D}/etc/udev/rules.d/ubifs.rules
}

FILES_${PN} += " /etc/udev/rules.d/ubifs.rules"

PACKAGES = "${PN}"
